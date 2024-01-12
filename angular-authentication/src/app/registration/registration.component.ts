import { Component } from '@angular/core';
import { FormsModule } from '@angular/forms';
import { MatInputModule } from '@angular/material/input';
import { MatButtonModule } from '@angular/material/button';
import { HttpClientModule } from '@angular/common/http';
import { HttpClient } from '@angular/common/http';
import { Router } from '@angular/router';

@Component({
  selector: 'app-registration',
  standalone: true,
  imports: [ FormsModule,
    MatInputModule,
    MatButtonModule, HttpClientModule,],
  templateUrl: './registration.component.html',
  styleUrl: './registration.component.scss'
})
export class RegistrationComponent {
  constructor(private http: HttpClient, private router: Router) { }
  isError:boolean = true;
  fullName: string = "";
  email: string = "";
  password: string = "";

  register() {
    this.isError=true;
    console.log('Registering with:', this.fullName, this.email, this.password);
    const registrationData = {
      fullName: this.fullName,
      email: this.email,
      password: this.password
    };

    this.http.post<any>('http://localhost:8080/register', registrationData)
      .subscribe(response => {
       console.log('Registration successful:', response);

       const token = response.token;

       sessionStorage.setItem('token', token);

       this.router.navigate(['/welcome']);
      }, error => {
        console.error('Error during registration:', error);
        this.isError=false;
      });
  }

}
