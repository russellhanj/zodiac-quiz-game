# zodiac-quiz-game

This repository contains the code and files for an electronic quiz system. It reads questions and answers from a file named "AstrologyQuiz.txt," displays questions to the user, and checks the user's score at the end of the quiz.

## Table of Contents
- [Features](#features)
- [Usage](#usage)
- [File Format](#file-format)
- [Example](#example)
- [License](#license)

## Features

- Reads quiz questions and answers from a file.
- Presents questions to the user and collects their answers.
- Checks the user's score based on their answers.
- Provides user-friendly feedback on the quiz results.

## Usage

1. Clone this repository to your local machine.
2. Compile the Java code (if necessary) using your preferred Java development environment.
3. Ensure you have a quiz file named "AstrologyQuiz.txt" in the same directory as the executable code.
4. Run the program to start the quiz.

## File Format

The quiz questions and answers are stored in a text file named "AstrologyQuiz.txt." The file format is as follows:

- The first line of the file specifies the number of questions in the quiz.
- Each question is structured as follows:
  - The question text is on a line by itself.
  - The answer options are listed on the following lines, with an asterisk (*) indicating the correct answer.
  - Options should not display the asterisk to the user.
  - Questions are separated by an empty line.

Example quiz file:
3
What is the largest planet in our solar system?
Jupiter
Mars
Saturn
*Earth

How many zodiac signs are there?
*12
6
9
7

Which planet is known as the Red Planet?
Venus
*Mars
Neptune
Pluto

## Example

Here's an example of how the program reads questions from "AstrologyQuiz.txt" and conducts a quiz:

1. The program reads the file and identifies the number of questions.
2. It presents each question and its options to the user.
3. The user selects an option for each question.
4. At the end of the quiz, the program calculates the score based on the user's answers and displays the results.

Enjoy the quiz!
