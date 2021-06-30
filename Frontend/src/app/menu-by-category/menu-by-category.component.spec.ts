import { ComponentFixture, TestBed } from '@angular/core/testing';

import { MenuByCategoryComponent } from './menu-by-category.component';

describe('MenuByCategoryComponent', () => {
  let component: MenuByCategoryComponent;
  let fixture: ComponentFixture<MenuByCategoryComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ MenuByCategoryComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(MenuByCategoryComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
