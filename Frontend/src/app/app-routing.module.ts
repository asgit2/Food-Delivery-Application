import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { AccountComponent } from './account/account.component';
import { AddMenuComponent } from './add-menu/add-menu.component';
import { AdminDashboardComponent } from './admin-dashboard/admin-dashboard.component';
import { AppComponent } from './app.component';
import { BookATableComponent } from './book-atable/book-atable.component';
import { CartComponent } from './cart/cart.component';
import { CustomerFormComponent } from './customer-form/customer-form.component';
import { FeedbackFormComponent } from './feedback-form/feedback-form.component';
import { GetChineseComponent } from './get-chinese/get-chinese.component';
import { GetDrinksComponent } from './get-drinks/get-drinks.component';
import { GetMenuByRestaurantComponent } from './get-menu-by-restaurant/get-menu-by-restaurant.component';
import { GetVegItemsComponent } from './get-veg-items/get-veg-items.component';
import { LoginComponent } from './login/login.component';
import { MenuByCategoryComponent } from './menu-by-category/menu-by-category.component';
import { MenuDisplayComponent } from './menu-display/menu-display.component';
import { MenuFormComponent } from './menu-form/menu-form.component';
import { PaymentgatewayComponent } from './paymentgateway/paymentgateway.component';
import { RestaurantFormComponent } from './restaurant-form/restaurant-form.component';
import { RestaurantdetailsComponent } from './restaurantdetails/restaurantdetails.component';

//Define Route Url
const routes: Routes = [
  {path:'displayMenu',component:MenuDisplayComponent  },
  {path:'getNonVeg',component:MenuByCategoryComponent},
  {path:'getVeg',component:GetVegItemsComponent},
  {path:'getChinese',component:GetChineseComponent},
  {path:'getDrinks',component:GetDrinksComponent},
  {path:'viewRestaurant',component:RestaurantdetailsComponent},
  {path: 'account' , component:AccountComponent},
  {path:'login', component:LoginComponent},
  {path:'customerReg', component:CustomerFormComponent},
  {path:'RestaurantEnrollment', component:RestaurantFormComponent},
  {path:'AddMenus', component:MenuFormComponent},
  {path:'cart',component:CartComponent},
  {path:'pay',component:PaymentgatewayComponent},
  {path:'feedback',component:FeedbackFormComponent},
  {path:'getByRestaurant',component:GetMenuByRestaurantComponent},
  {path:'adminDashboard',component:AdminDashboardComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
