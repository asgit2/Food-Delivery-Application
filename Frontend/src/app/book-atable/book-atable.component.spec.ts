import { ComponentFixture, TestBed } from '@angular/core/testing';

import { BookATableComponent } from './book-atable.component';

describe('BookATableComponent', () => {
  let component: BookATableComponent;
  let fixture: ComponentFixture<BookATableComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ BookATableComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(BookATableComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
