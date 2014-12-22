QuizAppIdea
===========

- Around 70 questions.
- A question is a single statement and can have a single answer, or one or more keywords for each question's answer.
- Questions can be organised by one or more proprietary categories (e.g. "Week 1, Nervous Systems, etc").
- New question entry in app?
- Exam mode
-- A configurable series of questions (by category(s)),
-- With a score given for each question based on the answer,
-- With a total score at the end? (% mark?)
-- Which is randomly generated
-- Which attempts can be saved?


Need:
A backend(DB?) to store questions (exam attempts?). 
Main menu screen (Add new question, Attempt exam, Exit).
- Add new question
-- Textbox for question text
-- List creator for answer keywords
-- Answer text to match answer against
-- Save
- Attempt exam
-- List creator for categories to include
-- Number of questions dropdown?
-- Go
-- <Generate exam from question bank>
--- Show question text
--- Time limit?
--- Clues? (Show a keyword and lower score?)
--- Answer text box
--- Answer button
---- <Evaluation of answer>
----- <match against answer text>
----- <Search for keywords>
---- <next question>
---- Repeat until number of questions elapsed
---- Show score (and answer comparison?)
----- Try again
----- Main menu