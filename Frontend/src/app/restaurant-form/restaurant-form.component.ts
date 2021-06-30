import { Component, OnInit } from '@angular/core';
import { Restaurant } from 'src/restaurant';

import { TestService } from '../test.service';

@Component({
  selector: 'app-restaurant-form',
  templateUrl: './restaurant-form.component.html',
  styleUrls: ['./restaurant-form.component.css']
})
export class RestaurantFormComponent implements OnInit {
  
  restaurant : Restaurant = new Restaurant();
  constructor(private service : TestService) { }

  ngOnInit(): void {
  }

  addNewRestaurant(){
    return this.service.addNewRestaurant(this.restaurant).subscribe(()=>{alert("Restaurant Data is Stored Successfully Add The food items")});
  }
}
