import { Component, OnInit } from '@angular/core';
import { User } from 'src/app/model/user.model';

@Component({
  selector: 'app-register',
  templateUrl: './register.component.html',
  styleUrls: ['./register.component.css']
})
export class RegisterComponent implements OnInit {
  public interst=['Bakery','Drinks','Desserts']
     public user1=new User('gane', '1213133','gane@email.com','bakery',false,'male')
     public user2=new User('gani', '1213133425','gani@email,.com','drinks',false,'male')

  constructor() { }

  ngOnInit(): void {
  }

}
