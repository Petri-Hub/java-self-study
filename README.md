<h1 align="center">☕ java-self-study</h1>

<br>

<h3 align="center">Java fundamentals, studied by writing the code.<br>Following an OCP certification study guide, one folder per chapter</h3>

<p align="center">
  <a href="https://github.com/Petri-Hub/java-self-study/commits/main"><img alt="Last commit" src="https://img.shields.io/github/last-commit/Petri-Hub/java-self-study" /></a>
</p>

<br>

## About

> **TL;DR:** I started writing Java and Quarkus in production without ever having written Java before, and learned it on the job. This is where I went back to the fundamentals, proving each rule of the language with a small program instead of only reading about it. It covers the book's assessment test and its first two chapters, and stopped there when work needed me studying other things.

## How it's studied

Most files are a `main` that prints something, and a good number exist because they **don't** compile. A rule you read is easy to forget; a rule that just rejected your file is not.

```java
// 1_building_blocks/classes/InvalidMultiplePublicClasses.java
public class InvalidMultiplePublicClasses {
	/*
	 * This class is OK and causes no problems.
	 */
}

public class IAmTheClassThatCausesTheProblem {
	/*
	 * As there shouldn't be two public classes
	 * within the same file. And i also have
	 * an name different from the root file.
	 */
}
```

Each chapter ends with the book's review questions, answered and scored in its own `TEST.md`. What I took from each stretch of pages is written down in [NOTES.md](NOTES.md).

## What's inside

```sh
├── 0.5_assessment_test  # the book's opening assessment, scored
├── 0_quick_testing      # side checks: access modifiers, nested classes, class loading
├── 1_building_blocks    # classes, imports, packages, constructors, primitives
├── 2_operators          # unary operators
└── NOTES.md             # what I learned, page by page
```

## Technologies

<table align="center">
  <tr>
    <td align="center" width="96"><img src="https://cdn.simpleicons.org/openjdk/9198A1" width="48" height="48" alt="Java" /><br>Java</td>
  </tr>
</table>
