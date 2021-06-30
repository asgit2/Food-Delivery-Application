import { Component, OnInit } from '@angular/core';
import { Reserve } from 'src/reserve';
import { TestService } from '../test.service';

@Component({
  selector: 'app-book-atable',
  templateUrl: './book-atable.component.html',
  styleUrls: ['./book-atable.component.css']
})
export class BookATableComponent implements OnInit {

  constructor(private service : TestService) { }
  reserve : any= new Reserve();
  ngOnInit(): void {
  }

  
  bookATable(){
    return this.service.bookATable(this.reserve).subscribe(() => {alert("Data added... Proceed to payment ")});
  }
}
