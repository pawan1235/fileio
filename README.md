# fileio

|Task|Elapsed Time|
-----|-----------|
Copy file one byte at a time|7.286596 sec
Copy file 1 kilobyte at a time|0.071488 sec
Copy file 4 kilobytes at a time|0.058550 sec
Copy file 64 kilobytes at a time|0.056424 sec
Copy file 1 line at a time|0.128309 sec

#Why Copy a file by using one byte slowest ?
Becasue the task copy-byte-by-byte is copy 1 byte of file at a time so it take the longest time to copy and write a file.Then there is a task that using a bufferReader and PrintWriter.This task is faster than 1 byte at a time because it will copy a whole 1 line and write that whole line but before it write the whole line.After it copy a whole line in byte it will convert byte to array of byte and then convert agian to a char and convert char to array of char and convert array of char to string then it write whole line in string.It faster but not the fastest. In the task copy file 1 KB,4 KB,64 KB is faster becasue amount of byte that can copy at a time is a lot more than 1 byte at a time. It should be a lot faster like 1KB is a lot faster than 1 byte at a time and 4 KB at a time is faster than 1 KB at a time and 64 KB at a time is faster than 4KB at a time.

