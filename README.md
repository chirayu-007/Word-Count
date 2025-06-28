# Word-Count
Word Count is a text processing project that analyzes word usage in a paragraph while intelligently cleaning and filtering the content using user-defined inputs. The project accepts three input files and produces detailed output insights.

Functionality
Input Files:

Main Paragraph File – Contains the raw paragraph or speech text.

Stopwords File – Includes common words (like "is", "the", "and", etc.) to be ignored during analysis.

Special Characters File – Lists symbols and punctuation (like @, #, !, etc.) to be removed from the paragraph.

Processing Steps:

Removes all specified stopwords.

Cleans the text by eliminating listed special characters and symbols.

Tokenizes the cleaned text into words and calculates word frequencies.

Output Includes:

Top 5 most frequently used words.

Bottom 5 least used words.

Top 10 used words.

Bottom 10 used words.

The single most used word.

Fully cleaned and filtered version of the input paragraph.

Use Cases
Natural language processing (NLP) practice

Data cleaning for text analysis

Pre-processing for machine learning or word cloud generation

 How to Use
Prepare the three input files as described.

Run the script.

Check the console or output file for the word usage summary and cleaned paragraph.
