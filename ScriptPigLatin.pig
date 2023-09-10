lines = LOAD 'C:\\Users\\U-19\\Desktop\\FILE DI INSTALLAZIONE\\ApacheSpark\\inputPig.txt' AS (line:chararray);
words = FOREACH lines GENERATE FLATTEN(TOKENIZE(line)) AS word;
wordCount = GROUP words BY word;
result = FOREACH wordCount GENERATE group AS word, COUNT(words) AS count;
STORE result INTO 'C:\\Users\\U-19\\Desktop\\FILE DI INSTALLAZIONE\\ApacheSpark\\Output' USING PigStorage(',');