import re
line="cars are faster than bus";
searchObj=re.search( r'(.*) are (.*?) .*', line, re.M|re.I)
if searchObj:
 print("searchObj.group(): ",searchObj.group())
 print("searchObj.group(1): ",searchObj.group(1))
 print("searchObj.group(2): ",searchObj.group(2))
else:
 print("Nothing Found !")
