# Assignment 1

Questions:
Given a few circumstances, try to think in objects and design the objects and behaviors for each question. Use the pseudo code to describe a certain sequence of invoking behaviors and objects. Try to think as much details as you can and come up with the solution independently.

1.Design a course management system (Like Canvas);

2.Design a pet adoption platform;

3.Design an app to book airline ticket;

4.Design a course registration platform;

5.Order food in a food delivery app (Like Uber Eats).

## Design a course management system (Like Canvas)

*- StudentUsers*

* Data: emailAddress, Password, Grades
* Behaviors: login, joinCourse, submitAssignments, resubmitAssignments, checkGrades, downloadFiles, checkNotifications, dismissAlert

*- ManagerUsers*

* Data: emailAddress, Password
* Behaviors: login, addCourse, cancelCourse, addAssignments, uploadGrades, changeGrades, addFiles

*- System*

* Data: Dashboard, Calendar, Notifications
* Behaviors: showList, showCourseInCalendar, addDeadlineToCalendar, sendNotifications

*- Dashboard*

* Data: Course, Alert
* Behaviors: showCourse, sendAlert

*- Course*

* Data: courseName, courseTime, Summary, Assignments, assignmentDeadline, Announcements, Grades, People, Files
* Behaviors: 

### Sequence of invoking behaviors on objects

>```java
>StudentUsers ruby;
>ManagerUsers siva;
>siva.login(emailAddress, password);
>Course info5100 = siva.addCourse(courseName, courseTime, summary, assignments, announcements, grades, people, files);
>System canvas;
>canvas.showList(dashboard, calendar, notifications);
>Dashboard dashboard = siva.addCourse(info5100.courseName);
>if ruby enrollToInfo5100
>  ruby.login(emailAddress, password);
>  ruby.joinCourse(info5100);
>  canvas.showCourseInCalendar(info5100.courseName, info5100.courseTime);
>  dashborad.showCourse(info5100);
>  if notifications shouldBeSent
>    canvas.sendNotifications(notifications);
>    ruby.checkNotifications(canvas.notifications);
>    if course isFinished
>      siva.addFiles(info5100.files);
>      ruby.downloadFiles(info5100.files);
>      siva.addAssignments(info5100.assignments, info5100.assignmentDeadline);
>      canvas.addDeadlineToCalendar(info5100.assignmentDeadline);
>      if assignments isFinished 
>        ruby.submitAssignments(info5100.assignments);
>      else if assignments isModified
>        ruby.resubmitAssignments(info5100.assignments);
>      else
>        dashboard.sendAlert(info5100.assignmentDeadline);
>        ruby.dismissAlert(info5100.assignmentDeadline);
>        if assignments isDue
>          siva.uploadGrades(ruby.grades);
>          ruby.checkGrades(ruby.grades);
>          if grades isWrong
>            siva.changeGrades(ruby.grades);
>else
>  siva.cancelCourse(info5100);  
>```

## Design a pet adoption platform

*- User*

* Data: emailAddress, Password, Name, Address, creditCard, Phone
* Behaviors: Login, Adopt, Search, Pay, chooseTime, reChooseTime, requestCanceAdopt

*- Platform*

* Data: petDog, petCat, petBird
* Behaviors: checkOut, sendAdoptCertificate, sendAdoptTime

*- Pet*

* Data: Breed, Size, Color, adoptPrice, healthCertificate
* Behaviors:

### Sequence of invoking behaviors on objects

>```java
>User ruby;
>Platform lovePet;
>ruby.login(emailAddress, password);
>Pet petDog = ruby.search(Breed, Size, Color, adoptPrice, healthCertificate);
>if lovePet hasPetDog
>  ruby.adopt(petDog);
>  ruby.pay(petDog);
>  lovePet.checkout(ruby.name, ruby.address, ruby.creditCard, ruby.phone);
>  lovePet.sendAdoptCertificate(ruby.emailAddress);
>  ruby.chooseTime(petDog);
>  if adoptTime isAvailable
>    lovePet.sendAdoptTime(petDog);
>  else
>    ruby.rechooseTime(petDog);
>    lovePet.sendAdoptTime(petDog);
>    if ruby changeHerMindBeforeAdopt
>      ruby.requestCancelAdopt(petDog);
>else lovePet hasNoDog
>```

### Sequence of invoking behaviors on objects

## Design an app to book airline ticket

### Sequence of invoking behaviors on objects

## Design a course registration platform

### Sequence of invoking behaviors on objects

## Order food in a food delivery app (Like Uber Eats)

### Sequence of invoking behaviors on objects
