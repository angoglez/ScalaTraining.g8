# Milestone 0 - Learn about Git/GitHub

In this milestone you will learn about a tool that you are going to use in you daily life as a developer called Git. 
We strongly encourage you to follow the steps in order and also read/learn on your own about each command. Here you can
find  the most basic and frequent usages, but there are lot more flags and options that you can investigate too.

## Step 0: Get Git and GitHub 

Git is a free open source software which main goal is to keep track of changes over time in the files of your projects, 
known in programming as version control.
It's also really helpful to coordinate work on those files among multiple people since it's a distributed version 
control system, allowing every user access to a full and self-contained history of all changes.
 
> - [Download](https://git-scm.com/downloads) and install Git on your machine
>
> - Make sure you have already Git typing `git --version` in your terminal. If it returns a version number, you're set!
>
> - First thing is set your user name and mail address, information needed to track all your work.
>Write `git config --global user.name "Your name"` and `git config --global user.email an@example.com`
>
> - Also you can set up your favorite text editor to open and edit your files with Git. You can use for that the command
>`git config --global core.editor "your-fav-edit"`. Visit 
>[this](https://help.github.com/en/github/using-git/associating-text-editors-with-git) site to see some examples, 
>since depending on what is your favourite editor, command may vary. 
>
> - Likely you won't work alone. You will need something to publish your code and collaborate with others, and here is
>where GitHub appears. GitHub is a platform that hosts Git repositories online, making easier for developers to 
>collaborate and contribute to multiple teams and projects. Visit [GitHub](github.com) and create your account.
>
> - We usually connect to GitHub with SSH. This way the connection and authentication is more secure and you won't have
>to supply your username or password at each visit. Go through steps explained
>[here](https://help.github.com/en/github/authenticating-to-github/connecting-to-github-with-ssh)
>and set up your first SSH key. 
>

## Step 1: Let's create a repo

When we talk about a repository, we are referring to a folder that contains some related files tracked by Git. 
Git will track removed files, new ones added and even every single letter changed in a single file. 
Now you are going to create your very first repo which will contain all the directories and content you need 
for your training. 

>  - Select and, using the terminal, go into the directory where you want to create your new repo.
>
> -  Type `sbt new <put here where g8 template it's uploaded>`. With this command, sbt using a template will create the
> project where you will develop all your training exercises. Just push enter to all the prompts to keep default values.
> You will find two folders, `target` and another one named `47deg-scala-training`. Navigate to last one. 
>
> - Now, let's tell Git we want to make it a repository typing `git init`.
>
> - Check the status of your repository using `git status`. You will see a list with all the new files previously created. 
>We are going to tell Git to add them so it becomes part of the changes we want to track and save. Use 
>`git add <file/directory>`.
>For adding everything at once you can add `.` at the end of the command. Another interested option you can use is
>`git add -p`.  This way you can see one by one the changes you have made and choose with an interactive prompt which ones
>you want to add or not to commit them later. Read more [here](https://gist.github.com/mattlewissf/9958704) about this 
>powerful flag.
>
> - You will see that sometimes when you do `git add`, Git suggest you to track some folders or files with extensions
>that are not related with the content of the project or that simply you don't want to appear there. To solve this issue,
>we can create in our repo a file called `.gitignore`, which is a text file that tells Git which files or folders to 
>ignore in a project. In your repo you will find one already created. Open it and add some lines to ignore the Mac 
>system files `.DS_store` or other IDE config files such as `.idea/` from IntelliJ, for example. Learn more 
>[here](https://guide.freecodecamp.org/git/gitignore/) about that topic. After this modification, you should add too 
>this file to the list of files to track (also called staging area)
>
> - And finally, we can commit those changes to the repository's history with a short message describing the updates:
>`git commit -m "Initial commit"`
>
> - Now, we think our last commit message it's not so descriptive, so we want to change it. You can do that with 
>`git commit --amend -m "example message"`. Commit messages matter a lot so learn 
>[here](https://chris.beams.io/posts/git-commit/) why and how to make good ones. 
>
> - To see how your commit history is going, use `git log`.


## Step 2: Starting with remotes

The former created repository it's just on your computer, so you can't share your work and collaborate with others so far.  

> - In GitHub, create a [new](https://github.com/new) repository. This is a remote repository since it's not on your 
>computer, but on a server somewhere else. Mark yourself as owner. Choose a name for the repo (usually it's the name 
>of the project you are developing) and add a brief description if you want.
>
> - Make your repo public, this way everyone can access to it. If it's private, only the collaborators that you choose 
>can access and collaborate with you.
>
> - Mark the option _Initialize this repository with a README_ and once created at
>least you will see that file as content of your repo. READMEs are usually shown in the root of the repo and it 
>It usually describes what kind of project it is, how it can be useful, how to install and use it, guidelines for 
>contributing, license notice and whatever else the developers would want other people to read.
>
> - Do not add a `.gitignore` file since we have already created ours and we will upload it later. 
>
> - Public repositories on GitHub 
>are often used to share open source software. When you try to have a repo truly open source, you'll need to license it so 
>that others are free to use, change, and distribute the software. Choose _Apache License 2.0_ as a license for your repo.
>You can read more about licenses
>[here](https://www.freecodecamp.org/news/how-open-source-licenses-work-and-how-to-add-them-to-your-projects-34310c3cf94/).
>And now, hit the green button _Create repository_!
>
> - Next step is to connect our local repository (the first created in our machine) to the remote one in GitHub, 
>pushing our changes to it. In your terminal (located in the folder that is our local repo), write 
>`git remote add origin <url of your repo>`. You can copy the URL of your repo in the address bar and add `.git` at the
>end. 
>
> - It's time to upload our content and make it available online. Type `git push -u origin master` for achieve that.
>
> - Refresh the page and you will finally see all the content online, up in your remote repository.

## Step 4: Continuous Integration

Code of a project changes continuously, even more when a team is working simultaneously in a repo. This way it gets
so complicated to detect errors in our code quickly and locate them easily. Continuous Integration is a development 
practice that help us with this. It automates the process of building the application and running a set of test to confirm
everything keeps working with the new changes made in the code. There are several tools to apply that, for example
[GitHub Actions](https://github.com/features/actions).

> - In your repo in GitHub, search in the main bar the _Actions_ section. Click in the _New workflow_ button. 
>GitHub Actions will suggest us a simple workflow for Scala that covers all our needs for the moment. Click in 
>_Set up this workflow_. 
>
> - As you can see, GitHub Actions will create some folders in the root of our repo  (`.github/workflows/`) where we can
>store different workflows, which are custom automated processes that you can set up in your repository to build, test,
>package, release, or deploy any project on GitHub. One workflow is defined in a file with an `.yml` extension and must
>have at least one job with a set of steps that perform individual tasks.This steps can run commands or use other actions
>created previously by the GitHub community or by others. Note that indentation is very important in this type of files.
>
> - Focus now your attention in the pre-created file. Give it a proper name. You can also change the name of your 
>workflow editing the value of the key `name` in the file. 
>
> - With the key `on` we can specify the events that we want to
>trigger our workflow and we even can specify which branches with the key `branches`. Initially our file express that
>the workflow will be triggered each time a push or a pull request occurs against master.  Don't worry, you will learn 
>about these events soon in this tutorial. 
>
> - We are going to change this a little bit. We want the workflow to run each 
>time a push occurs in any branch, so you must write `'*'` instead `[ master ]`. 
>
> - The key `jobs` include the list of tasks that the workflow will perform. By default in this example,
>there is one called `build`. Inside it we can find other keys that compound the job.
>
> - With the key `runs-on` we are specifying the type of machine to run the job on. 
>We can use some GitHub-hosted runners that they have already set up, so here we are using the latest version of ubuntu.
>
> - The key `steps` includes all the tasks that the job needs to do. In this file we can see three tasks. First one without
>a name, that is a tasks that uses an already defined action to obtain a copy of our repo. Second one, which name is 
>_Set up JDK 1.8_, uses another action to choose the JDK we need in order to to do the next task. Some parameters are 
>passed using the key `with`. And finally last one, called _Run tests_ , that indicates with the key `run` some commands
>that should be executed in the terminal. In our case, it's only running `sbt test` to see if tests are passing. We
>recommend you to have a look at the [GitHub Actions docs](https://help.github.com/en/actions) to obtain more in-depth 
>information about what here is presented in a simple way.
>
> - Once we have finished writing our configuration file, we just need to make it available in our repo. Push the button
>_Start commit_. Include a message, a description if you want, choose the email to associate with this commit and pick 
>the option _Commit directly to the master branch_. This way we have include the file in our GitHub repository.
>
> - This will lunch for the very first time our workflow. Check this in the _Actions_ section in your repo. Wait a bit
> and you will see our workflow running. Learn more 
>[here](https://help.github.com/en/actions/configuring-and-managing-workflows/managing-a-workflow-run) about managing
>a workflow run and understanding the dashboard. What can you see? It's our fist build passing?



## Step 5: The usual workflow

Oh,oh! It seems something is failing, it's your time to code. Let's play with the usual git commands and learn a 
little bit about the usual git workflow.

At this point, it's usual to manage branching. Branching means you diverge from the main line of development and 
continue to do work without messing with that main line, regularly called `master` which is  the official working 
version of your project.

> - With `git branch` you will see the list of the branches of your repository. An `*` will appear before the
>branch you are at the moment. In our case, still `master`.
> - Create one branch typing `git checkout -b <new-branch> <existing branch>`. In this case you can omit last argument 
>since we are already in `master`.
>
> - Working locally, fix the error. Remember to keep tracking the changes you're causing using `git add` 
,`git commit`...
>
> - Now, imagine another team mate also realizes the error and wants to fix it and start implementing more things.
> Create your mate branch from master as explained before (first, change to master branch). Fix the error, but inverting
> the addend. Then, add to Calculations.scala` two new methods for adding and subtracting two integers. 
>
> - Change to the branch you created previously to fix the error using `git checkout <your-branch>`. All the work in 
>your branch is only available locally. Let's upload it to the remote repository using `git push --set-upstream origin 
<your-branch>` . Now you will be able to see the branch in GitHub. 
>
> - Ok, it's time to integrate your changes in master. In the page of your repo in GitHub, go to _Pull Requests_ section
>and click the _New pull request_ button. 
> Compare your branch against master and click _Create pull request_. In this page you should tell describe the changes
> you've pushed to a GitHub repository. Once a pull request is sent, interested parties can review the set of changes, 
>discuss potential modifications, and even push follow-up commits if necessary.
>
> - Request a review (for example of your mentor).
> Visit the section _Files changed_ to familiarize with the way how GitHub displays changes in files.
>
> - In the page of the Pull Request (PR) you will see some automatic checks done by our Travis. 
> Merge your code into master when all checks have passed an you have the approval of your reviewer. 
>
> - After that, come back to your mate's branch. Make a `push` to make available in the remote repository all your 
>mate's changes. At some point, your mate will probably want to merge them in master. Create a PR against master from 
>your mate's branch.
>
> - Ops,conflicts! That means you and your mate have done changes to the same file and Gits needs to know what is the
>correct version. Sometimes you will be able to resolve conflicts using the UI in GitHub, but other times it will be 
>better to use and IDE for managing them. Click in _Resolve conflicts_ button. Here you can decide if you want to keep 
>only your branch's changes, keep only the other branch's changes, or make a brand new change, which may incorporate
>changes from both branches. This time we are going to incorporate our `add47` method implementation but also the 
>two other methods of our mate. Delete the conflict markers `<<<<<<<`, `=======`,`>>>>>>>` and once finished, click 
>_Mark as resolved_. After all this, you can _Commit merge_ and merge successfully into `master`.
>


## Step 6: Other useful commands

In this step we are going to recreate some scenarios with basic usages of another useful commands you can find in Git.

Ok, our last changes are in `master`. We are here "playing" and simplifying things a little bit, but `master` must
be a clean branch and we should never mess with it. It's like the official working version of your project, has to be
stable and it only must contain the commits for new releases.  

For that reason, we are going to continue working in our branch previously created. We know that we have included some
changes in `master` that our branch doesn't have. In order to work with an updated version of it, we must incorporate 
them. 

> - Be sure to checkout to our branch.
>
> - Type `git merge master`. Command `merge` allows us to combine two branches. 
>
> - Check with `git log` tha we have incorporated `master`'s commits in our branch.
>
> - Now, write two test for the new methods in `Calculations.scala`. Create one commit for each one and push them to the
>remote.   
> 
> - Our example is very simply, but imagine in the two last commits you introduced something that finally you don't want
> to add to your project. In our case, we are going to discard the two last created tests so we must undo de two last 
>commits. First, copy the hash (code of number and letters) of the commit where you want to come back, that is, the
>previous one to the first commit you want to delete. Use `git log --oneline`
to identify it. Then type `git reset <comit-hash>`. You can check in the log that the last two commits now  don't appear.
>
> - But ops... we are messing a little bit and, finally yes, we  will need the two tests that we just deleted. What can 
>we do? Well, we have made last changes in our local repo, but remember that in our remote we pushed the commits 
>adding each test. We are going to recover them. Type `git pull` and it will download all the commits from the point 
>where the local and the remote diverged. 
> 
> - Let's add another test to the file. This time, create one that might use both methods in `Calculations.scala`, 
>for example, testing the correct solution of 220 - 20 + 4. Create a commit and push it to the remote. 
>
> - What happens if we have pushed something and later we have changed our opinion and we don't want it uploaded? You 
>can think we can do the same we did previously using `git reset` but, sorry, you are wrong. You should never use 
>`git reset <commit>` when any more changes after `<commit>` have been pushed to a public repository. After publishing 
>a commit, you have to assume that other developers are reliant upon it. For example, now we are going to discard the 
>changes made in the last commit, the one with the test mixing the methods. What we can do in this situation is
>use `git revert`. Instead of removing the commit from the project history, it figures out how to invert the changes 
>introduced by the commit and appends a new commit with the resulting inverse content. Use `git revert HEAD` to make the 
>commit that it's the opposite of the last one. Then push it to the remote. That way, the repo is in our desired state.
>
> - It's very important to keep the history of your project clean. It gives all the developers a lot of information and 
>must be easy to understand and follow. Git helps with this including a very useful tool called `rebase` that allow us 
>to easily change a series of commits, modifying the history of your repository. You can reorder, edit, or squash commits 
>together. Well, we are talking again about your local work, since it's considered bad practice to rebase commits when 
>you've already pushed to a repository, though you can do it.
>
> - For practice a bit, we're going to keep working in our branch. Create again the two tests for the `add` and `sub` but
>make two separated commits. Create a new method for multiply (`mul`) and make a typo when writing the commit. Then write
>another method for divide (`div`) and its test and make a commit again. Remember do not push anything.
>
>- Once you have done all this, we are going to incorporate all the work in our branch in `master` using rebase. If you type 
>only `git rebase`, it will automatically take the commits in your current working branch and apply them 
>to the head of the passed branch, in our case `master`. It looks like a `merge` but they work different as you can learn
>[here](https://www.freecodecamp.org/news/an-introduction-to-git-merge-and-rebase-what-they-are-and-how-to-use-them-131b863785f/).
>
> - But first we are going to make some changes in our commits, so we will use the interactive mode, typing `git rebase -i`. 
>This will open a text file in your configured editor (or the one your terminal is using) with a list of your last 
>commits. You can change the order of the commits by changing the order of the lines and also decide for each one 
>what action to do (in the file are listed below all the options). 

> - In our case, we're going to change the order so the commit about `div` method and its test will appear first. For this, 
>just put that commit the first one in the file (commits will be applied from top to bottom).
>
> - Second will be the one about `mul`, and you must use `edit`to correct the made typo. 
> - The last two will be the commits about the tests for `add` and `sub` but we're going to squash
>them in one and change the message, so you need to use the option `fixup` for that. Once we have specified in the file
>the things we want to make, save the file and close it.  
>
> - Probably some auto-merging conflicts will occur. Solve them opening the file and selecting the changes you want to appear
>in the commit. Save the file an close it. To mark them as solved, use `git add <file>`. 
>
> - After that, type `git rebase --continue` to continue the process.In every moment you can make a `git status` to see how the rebase process is going, the commits already done and the 
>ones remaining.
>
> - Once finished, you can test that our history appears just the way how we have decided 
>with `git log --oneline`. Finally, push your work to master to make it public.


## References: 

- [Git Documentation](https://git-scm.com/doc) - Official docs of Git, including some videos, reference manual and a
well-know and recommended book as _Pro Git_.
- [Teaching Git](https://rachelcarmena.github.io/2018/12/12/how-to-teach-git.html) - A post from our mate Raquel Carmena
where you will learn to discern between local and remote environments when developing. It also includes others
interesting references inside. 
- [GitHub help](https://help.github.com/en/github) - Official docs site of GitHub.
- [Atlassian Git tutorial](https://www.atlassian.com/git/tutorials/learn-git-with-bitbucket-cloud) - Great and broad 
descriptions of basics in Git. Ignore stuff about Bitbucket, an alternative to GitHub. 
- [Freecodecamp #Git](https://www.freecodecamp.org/news/tag/git/) - A collection of useful posts explaining Git concepts.