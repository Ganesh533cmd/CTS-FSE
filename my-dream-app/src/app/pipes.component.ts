import { Component } from '@angular/core';

@Component({
  selector: 'app-hero-birthday',
  template: `<p>The hero's birthday is {{ birthday | date }}</p>
  <h3>{{name | Uppercase}}</h3>
  <h3>{{name | lowercase}}</h3>
  <h3>{{name | titlecase}}</h3>
  <br>
  
  `
})
export class HeroBirthdayComponent {
  birthday = new Date(1988, 3, 15); 
}