parser grammar test_minimal;

options {
    tokenVocab = mysqllexer;
}

start
    : SELECT ID FROM ID EOF
    ;
