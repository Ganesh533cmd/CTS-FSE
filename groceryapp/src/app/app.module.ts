import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { HttpClientModule } from '@angular/common/http';

import { AppComponent } from './app.component';
import { NavbarComponent } from './groceryapp/navbar/navbar.component';
import { HomeComponent } from './groceryapp/home/home.component';
import { FooterComponent } from './groceryapp/footer/footer.component';
import { HeaderComponent } from './groceryapp/header/header.component';
import { ProductsComponent } from './groceryapp/products/products.component';
import { CartComponent } from './groceryapp/cart/cart.component';

import{AppRoutingModule}from './app-routing.module';
import { LoginComponent } from './groceryapp/login/login.component';
import { RegisterComponent } from './groceryapp/register/register.component';
import { SubCatComponent } from './groceryapp/sub-cat/sub-cat.component';
import { FormsModule, ReactiveFormsModule }   from '@angular/forms';
import { ReactiveFormComponent } from './component/reactive-form/reactive-form.component';
@NgModule({
  declarations: [
    AppComponent,
    NavbarComponent,
    HomeComponent,
    FooterComponent, 
    HeaderComponent,
    ProductsComponent,
    CartComponent,
    LoginComponent,
    RegisterComponent,
    SubCatComponent,
    ReactiveFormComponent
  ],
  imports: [
    BrowserModule,
    HttpClientModule,
    AppRoutingModule,
    FormsModule,
    ReactiveFormsModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }