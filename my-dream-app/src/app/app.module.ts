import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { Observable } from "rxjs/Observable";

import { AppComponent } from './app.component';
import { TestComponent } from './test/test.component';
import { HeaderComponent } from './header/header.component';
import { SidebarComponent } from './sidebar/sidebar.component';
import { FooterComponent } from './footer/footer.component';
import { NavbarComponent } from './navbar/navbar.component';
import{ FormsModule }from '@angular/forms';
import { EmployeeComponent } from './employee/employee.component';
import { EmployeeListComponent } from './employeelist/employeelist.component'
import { HttpClientModule } from '@angular/common/http';
import { UserComponent } from './user/user.component';
import { observable } from 'rxjs';
@NgModule({
  declarations: [
    AppComponent,
    HeaderComponent,
    SidebarComponent,
    FooterComponent,
    NavbarComponent,
    TestComponent,
    EmployeeComponent,
    EmployeeListComponent,
    HttpClientModule,
    FirstComponent,
    UserComponent,
    observable,
    employee
  ],
  imports: [
    BrowserModule,
    FormsModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export interface IPost {

 }
