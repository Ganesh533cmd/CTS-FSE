import { Component, OnInit } from '@angular/core';
import { HttpClientModule, HttpClient } from '@angular/common/http';
import { UpperCasePipe } from '@angular/common';
import { DataService } from '../data.service';

@Component({
  selector: 'app-first',
  templateUrl: `<p>Template Reference Variable</p>
  <input type="text" #myInput/>
  <button (click)="onButtonClick(myInput.value)">Button</button>


  <p>Two Way Data Binding</p>
  <h1>{{ name }}</h1>
  <input type="text" [(ngModel)]="name"  />
`,
  styleUrls: ['']
})
export interface Config {
  heroesUrl: string;
  textfile: string;
}
data: DataService;

ShowData() {
  this.dataService.getData()
    // clone the data object, using its known Config shape
    .subscribe((data: Config) => this.config = {
      heroesUrl: (data as any).heroesUrl,
      textfile:  (data as any).textfile,
     });
     
}
