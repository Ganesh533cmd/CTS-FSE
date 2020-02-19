import {NgModule} from '@angular/core';
import {RouterModule, Routes} from'@angular/router';
import { RegisterComponent } from './groceryapp/register/register.component';
import { LoginComponent } from './groceryapp/login/login.component';
import { HomeComponent } from './groceryapp/home/home.component';
import { CartComponent } from './groceryapp/cart/cart.component';
import { ProductsComponent } from './groceryapp/products/products.component';

const routes: Routes=[
    {path:'login' , component:LoginComponent},
    {path:'register',component:RegisterComponent},
    {path:'home',component:HomeComponent},
    {path:'cart',component:CartComponent},
    {path:'products',component:ProductsComponent}

]
@NgModule({
    imports:[RouterModule.forRoot(routes)],
    exports:[RouterModule]
})
export class AppRoutingModule{ 

}