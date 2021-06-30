import { ComponentFixture, TestBed } from '@angular/core/testing';

import { GetMenuByRestaurantComponent } from './get-menu-by-restaurant.component';

describe('GetMenuByRestaurantComponent', () => {
  let component: GetMenuByRestaurantComponent;
  let fixture: ComponentFixture<GetMenuByRestaurantComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ GetMenuByRestaurantComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(GetMenuByRestaurantComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
