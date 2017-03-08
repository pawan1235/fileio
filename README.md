# fileio

|Task|Elapsed Time|
-----|-----------|
Copy file one byte at a time|7.286596 sec
Copy file 1 kilobyte at a time|0.071488 sec
Copy file 4 kilobytes at a time|0.198301 sec
Copy file 64 kilobytes at a time|0.059548 sec
Copy file 1 line at a time|0.128309 sec

#Why Copy a file by using one byte slowest ?
Becasue the task copy-byte-by-byte is copy 1 byte of file at a time so it take the longest time to copy and write a file.

