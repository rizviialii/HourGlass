{\rtf1\ansi\ansicpg1252\cocoartf2580
\cocoatextscaling0\cocoaplatform0{\fonttbl\f0\fnil\fcharset0 Menlo-Regular;\f1\fnil\fcharset0 Menlo-BoldItalic;\f2\fnil\fcharset0 Menlo-Italic;
}
{\colortbl;\red255\green255\blue255;\red204\green108\blue29;\red217\green232\blue247;\red230\green230\blue250;
\red18\green144\blue195;\red249\green250\blue244;\red30\green181\blue64;\red121\green171\blue255;\red242\green242\blue0;
\red104\green151\blue187;\red141\green218\blue248;\red243\green236\blue121;\red102\green225\blue248;\red150\green236\blue63;
\red167\green236\blue33;}
{\*\expandedcolortbl;;\csgenericrgb\c80000\c42353\c11373;\csgenericrgb\c85098\c90980\c96863;\csgenericrgb\c90196\c90196\c98039;
\csgenericrgb\c7059\c56471\c76471;\csgenericrgb\c97647\c98039\c95686;\csgenericrgb\c11765\c70980\c25098;\csgenericrgb\c47451\c67059\c100000;\csgenericrgb\c94902\c94902\c0;
\csgenericrgb\c40784\c59216\c73333;\csgenericrgb\c55294\c85490\c97255;\csgenericrgb\c95294\c92549\c47451;\csgenericrgb\c40000\c88235\c97255;\csgenericrgb\c58824\c92549\c24706;
\csgenericrgb\c65490\c92549\c12941;}
\margl1440\margr1440\vieww11520\viewh8400\viewkind0
\deftab720
\pard\pardeftab720\partightenfactor0

\f0\fs28 \cf2 import\cf3  \ul java\cf4 \ulc4 .\cf3 \ulc3 io\cf4 \ulnone .*;\cf0 \
\cf2 public\cf3  \cf2 class\cf3  \cf5 sixBYsix\cf3  \cf6 \{\cf0 \
\
\pard\pardeftab720\partightenfactor0
\cf3 	\cf2 public\cf3  \cf2 static\cf3  \cf2 void\cf3  \cf7 main\cf6 (\cf5 String\cf6 []\cf3  \cf8 args\cf6 )\cf3  \cf6 \{\cf0 \
\cf3 		\cf2 int\cf6 []\cf3  \cf9 \ul \ulc9 sumArr\cf3 \ulnone  \cf4 =\cf3  \cf2 new\cf3  \cf2 int\cf3  \cf6 [\cf10 36\cf6 ]\cf4 ;\cf0 \
\cf3 		\cf2 int\cf6 [][]\cf3  \cf9 jArr\cf3  \cf4 =\cf3  \cf6 \{\cf0 \
\cf3                 \cf6 \{\cf4 -\cf10 9\cf4 ,-\cf10 9\cf4 ,-\cf10 9\cf4 ,\cf10 1\cf4 ,\cf10 1\cf4 ,\cf10 1\cf6 \}\cf4 ,\cf0 \
\cf3                 \cf6 \{\cf10 0\cf4 ,-\cf10 9\cf4 ,\cf10 0\cf4 ,\cf10 4\cf4 ,\cf10 3\cf4 ,\cf10 2\cf6 \}\cf4 ,\cf0 \
\cf3                 \cf6 \{\cf4 -\cf10 9\cf4 ,-\cf10 9\cf4 ,-\cf10 9\cf4 ,\cf10 1\cf4 ,\cf10 2\cf4 ,\cf10 3\cf6 \}\cf4 ,\cf0 \
\cf3                 \cf6 \{\cf10 0\cf4 ,\cf10 0\cf4 ,\cf10 8\cf4 ,\cf10 6\cf4 ,\cf10 6\cf4 ,\cf10 0\cf6 \}\cf4 ,\cf0 \
\cf3                 \cf6 \{\cf10 0\cf4 ,\cf10 0\cf4 ,\cf10 0\cf4 ,-\cf10 2\cf4 ,\cf10 0\cf4 ,\cf10 0\cf6 \}\cf4 ,\cf0 \
\cf3                 \cf6 \{\cf10 0\cf4 ,\cf10 0\cf4 ,\cf10 1\cf4 ,\cf10 2\cf4 ,\cf10 4\cf4 ,\cf10 0\cf6 \}\cf0 \
\cf3              \cf6 \}\cf4 ;\cf0 \
\cf3 		\cf2 int\cf3  \cf9 maximum\cf3  \cf4 =\cf3  \cf5 Integer\cf4 .
\f1\i\b \cf11 MIN_VALUE
\f0\i0\b0 \cf4 ;\cf0 \
\cf3 		\cf2 for\cf6 (\cf2 int\cf3  \cf9 row\cf4 =\cf10 0\cf4 ;\cf3  \cf12 row\cf4 <\cf12 jArr\cf4 .\cf13 length\cf4 -\cf10 2\cf4 ;\cf3  \cf12 row\cf4 ++\cf6 )\cf3  \cf6 \{\cf0 \
\cf3 			\cf2 for\cf6 (\cf2 int\cf3  \cf9 column\cf4 =\cf10 0\cf4 ;\cf3  \cf12 column\cf4 <\cf12 jArr\cf4 .\cf13 length\cf4 -\cf10 2\cf4 ;\cf3  \cf12 column\cf4 ++\cf6 )\cf3  \cf6 \{\cf0 \
\cf3 				\cf2 int\cf3  \cf9 sum\cf3  \cf4 =\cf3  \cf6 (\cf12 jArr\cf6 [\cf12 row\cf6 ][\cf12 column\cf6 ]\cf3  \cf4 +\cf3  \cf12 jArr\cf6 [\cf12 row\cf6 ][\cf12 column\cf4 +\cf10 1\cf6 ]\cf3  \cf4 +\cf3  \cf12 jArr\cf6 [\cf12 row\cf6 ][\cf12 column\cf4 +\cf10 2\cf6 ]\cf0 \
\cf3 										 \cf4 +\cf3  \cf12 jArr\cf6 [\cf12 row\cf4 +\cf10 1\cf6 ][\cf12 column\cf4 +\cf10 1\cf6 ]\cf0 \
\cf3 					  \cf4 +\cf3  \cf12 jArr\cf6 [\cf12 row\cf4 +\cf10 2\cf6 ][\cf12 column\cf6 ]\cf3  \cf4 +\cf3  \cf12 jArr\cf6 [\cf12 row\cf4 +\cf10 2\cf6 ][\cf12 column\cf4 +\cf10 1\cf6 ]\cf3  \cf4 +\cf3  \cf12 jArr\cf6 [\cf12 row\cf4 +\cf10 2\cf6 ][\cf12 column\cf4 +\cf10 2\cf6 ]\cf0 \
\cf3 					\cf6 )\cf4 ;\cf0 \
\cf3 				\cf12 maximum\cf3  \cf4 =\cf3  \cf5 Math\cf4 .
\f2\i \cf14 max
\f0\i0 \cf6 (\cf12 maximum\cf4 ,\cf3  \cf12 sum\cf6 )\cf4 ;\cf0 \
\cf3 			\cf6 \}\cf0 \
\cf3 		\cf6 \}\cf0 \
\cf3 		\cf5 System\cf4 .
\f1\i\b \cf11 out
\f0\i0\b0 \cf4 .\cf15 println\cf6 (\cf12 maximum\cf6 )\cf4 ;\cf0 \
\cf3 	\cf6 \}\cf0 \
\pard\pardeftab720\partightenfactor0
\cf6 \}\cf0 \
}