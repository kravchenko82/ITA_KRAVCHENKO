When you are feeling a need to do something with source code of Druzzers
1) Go to project issues 
	https://gitlab.com/druzzers/Druzzers/issues
	
2) Choose your task (f.e. Implement PersonalDataController)

3) Remember the number of this task. In this case it`s #12

4) Open the issue in your browser. You will see a comment box. 
Type into it:
	/assign 
	and choose yourself in a list.
	
5) Ok. Now you are free to do your task. Open you IDE. Do it. Test it.

6) Create a branch. Give it a name. 
	Name should have this template:
	DRZ#-issue-name
	In case of "Implement PersonalDataController" with #12:
	DRZ012-Implement-PersonalDataController
	
7) Commit what you have done.
Good commit:
	"Working on issue #12 Implement PersonalDataController.
	Implemented GET,POST, etc."
If you changed not only one file, then write what you have done to all that files.

Bad commits:
	"my commit"
	"ну сделал тут мальца"
	"такие дела"
	"не работает, но ты мерджь, жалко чтоли?"
	"my cumshot"
	"DRZ012-Implement-PersonalDataController"
	
8) Push this branch to the same name branch of our repository.

9) Now open your browser. Go to the "Merge Request", select "New Merge Request".
	https://gitlab.com/druzzers/Druzzers/merge_requests/new
	
10) In left corner choose a branch you have just pushed. 
    In right corner choose the branch you wish to merge your work.