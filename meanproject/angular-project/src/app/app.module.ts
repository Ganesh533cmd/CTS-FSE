import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import {AppRoutingModule}from './app-routing.module'
import { AppComponent } from './app.component';
import { ComponentsComponent } from './components/components.component';
import { EmployeeCreateComponent } from './components/employee-create/employee-create.component';
import { EmployeeUpdateComponent } from './components/employee-update/employee-update.component';
import { EmployeeDeleteComponent } from './components/employee-delete/employee-delete.component';
import { EmployeeListComponent } from './components/employee-list/employee-list.component';

@NgModule({
  declarations: [
    AppComponent,
    ComponentsComponent,
    EmployeeCreateComponent,
    EmployeeUpdateComponent,
    EmployeeDeleteComponent,
    EmployeeListComponent,
    AppRoutingModule
  ],
  imports: [
    BrowserModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
