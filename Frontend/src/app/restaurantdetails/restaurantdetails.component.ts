import { Component, OnInit } from '@angular/core';
import { TestService } from '../test.service';

@Component({
  selector: 'app-restaurantdetails',
  templateUrl: './restaurantdetails.component.html',
  styleUrls: ['./restaurantdetails.component.css']
})
export class RestaurantdetailsComponent implements OnInit {

  constructor(private service : TestService) { }
  restaurant : any= this.service.FeatchAllRestauarnts().subscribe((data: any)=> this.restaurant=data);
  
  ngOnInit(): void {
  }

}
