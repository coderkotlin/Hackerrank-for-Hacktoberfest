# How to Contribute

- Fork this repository - [How to fork a repository](https://services.github.com/on-demand/intro-to-github/create-pull-request)
- Clone the forked repository into local space
- Choose any task on [HackerRank](https://hackerrank.com/)
- Paste the solution code in new file and name it in following format:
PROBLEM_NAME.[Format of language used in your code]
(you should match it with the url, such that when a user type the url
hackerrank.com/challenges/PROBLEM_NAME/problem
it will be redirected to the actual problem page)
- Place your source code file in respective folder (you can create a new folder if is not present)
- Optional - You can add comments at the start of the file, if you want to share something, like steps to run the code etc
- Add and commit the changes. (Please do not make changes in any other file, but if you want to wok on bug/improvement then add an issue first)
- Generate a Pull Request (Optional: add problem name in the title and url to the problem in description)
- That's it, you have successfully completed your 1 out of 5 PRs. Well Done!

# How to Sync Forked Repo from Upstream Repo

1. Add the original repository as an upstream repository
```java
$ git remote add upstream https://github.com/[Original Owner Username]/[Original Repository].git
```
Hence, in this repository it would be
```java
$ git remote add upstream https://github.com/coderkotlin/Hacktoberfest.git/
```

2. Fetch all the changes from the repository. Note that commits to the original repository will be stored in a local branch called, upstream/master
```java
$ git fetch upstream
```

3. Make sure that you are on your fork's master or working branch
```java
$ git checkout [working branch]
```
For example,
```java
$ git checkout master
```

4. Merge the changes from the upstream/master into your local master or working branch. This will sync the fork's master branch with the upstream repository without losing your local changes. If you have made any changes that create conflict, you will have to resolve the conflict before you can complete the merge
```java
$ git merge upstream/master
```

5. At this point, your local branch is synced with the upstream/master branch. In order to update the remote branch in Github, you need to push your changes
```java
$ git push origin master
```
