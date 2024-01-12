import { Component } from '@angular/core';
// import { BrowserModule } from '@angular/platform-browser';
import { FormsModule } from '@angular/forms';
import { MatInputModule } from '@angular/material/input';
import { MatButtonModule } from '@angular/material/button';
import { HttpClientModule } from '@angular/common/http';
import { HttpClient } from '@angular/common/http';
import { Router } from '@angular/router';

@Component({
  selector: 'app-login',
  standalone: true,
  imports: [FormsModule, MatInputModule,MatButtonModule, HttpClientModule],
  templateUrl: './login.component.html',
  styleUrl: './login.component.scss'
})
export class LoginComponent {
  username: string ="";
  password: string = "";
  isError:boolean = true;

  constructor(private http: HttpClient, private router: Router) { }
  login() {
    this.isError=true
    console.log('Logging in with:', this.username, this.password);
    const loginData = {
      fullName: this.username,
      password: this.password
    };

    this.http.post<any>('http://localhost:8080/login', loginData)
      .subscribe(response => {
       console.log('login successful:', response);

       const token = response.token;

       sessionStorage.setItem('token', token);

       this.router.navigate(['/welcome']);
      }, error => {
        console.error('Error during login:', error);
        this.isError=false;
      });
  }
}
