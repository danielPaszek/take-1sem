import { Component } from '@angular/core';
import { Student } from '../student';
import { ActivatedRoute } from '@angular/router';
import { Location } from '@angular/common';
import { StudentService } from '../student.service';

@Component({
  selector: 'app-student-detail',
  templateUrl: './student-detail.component.html',
  styleUrl: './student-detail.component.css'
})
export class StudentDetailComponent {
  student?: Student;
  constructor(
    private route: ActivatedRoute,
    private studentService: StudentService,
    private location: Location
   ) {}
   getStudent(): void {
    const pathId = this.route.snapshot.paramMap.get('id');
    if (pathId) {
      this.studentService.getStudent(+pathId)
      .subscribe(student => this.student = student);
      }
    }
  ngOnInit() {
    this.getStudent();
    }
  goBack(): void {
    this.location.back();
    }
  save(): void {
    this.studentService.updateStudent(this.student!)
    .subscribe(() => this.goBack());
    }
     
}
