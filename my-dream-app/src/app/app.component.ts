import { Component} from '@angular/core';
import { UpperCasePipe } from '@angular/common';
import { HttpClientModule, HttpClient } from '@angular/common/http';



@Component({
  selector: 'app-root',

  
/*   template:`

  <p>Template Referance Variable</p>
  <input type="text" #myInput/>
  <button (click)="onButtonClick(myInput.value)">Button</button>

  <p>Two Way Data Binding</p>
  <h1>{{name1}}</h1>
  <input type="text[(ngmodel)]="name1"/>
 <div>
   <h3 *ngIf="hasError">Hello form If</h3>
   <h3 *ngIf="!hasError">Hello from Else</h3>
   </div>

   <h3 *ngIf="hasError; else: elseBlock; then: ifBlock"></h3>

   <ng-template #elseBlock>
   <h3>Hello from another else</h3>
   </ng-template>

   <ng-template #ifBlock>
   <h3>Hello from another If</h3>
   </ng-template>
   <button *ngIf="!LoggedIn" class="btn btn-primary">Login</button>
   <button *ngIf="LoggedIn" class="btn btn-danger">LogOut</button>

   <div [ngSwitch]="number">
   <h3 *ngSwitchCase="1">one</h3>
   <h3 *ngSwitchCase="2">two</h3>
   <h3 *ngSwitchCase="3">three</h3>
   <h3 *ngSwitchDefault>Not in the List</h3>
   </div>
   <ul *ngfor="name of names">
   <li>{{name}}</li>
</ul>
<div class="container">
   <h3>Employee List</h3>
   <table class="table">
       <thead>
           <tr>
               <th>code</th>
               <th>name</th>
               <th>age</th>
           </tr>
       </thead>
       <tbody>
           <tr *ngfor="let employee of employees">
           <td>{{employee.empId</td>
           <td>{{employee.empName}}</td>
           <td>{{employee.age</td>
           </tr>
       </tbody>
   </table>
</div>


  `, */
  templateUrl:'./app.component.html',
  styleUrls:['']
})
export class AppComponent  {
  configUrl = 'assets/config.json';
  constructor[()]

  getConfig() {
    return this.http.get(this.configUrl);
  }




