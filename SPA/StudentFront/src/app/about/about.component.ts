import { Component } from '@angular/core';

@Component({
  selector: 'app-about',
  templateUrl: './about.component.html',
  styleUrl: './about.component.css'
})
export class AboutComponent {
  year: Number = 0;
  month: Number = 0;
  day: Number = 0;

  ngOnInit() {
  this.year = new Date().getFullYear();
  this.month = new Date().getMonth() + 1;  //XD
  this.day = new Date().getDate();
    }
  
}
