#!/bin/bash
echo "# spring-boot-with-spring-batch-sample" >> README.md
git init
git add README.md
git commit -m "first commit"
git branch -M main
git remote add origin git@github.com:spring-boot-code-sample/spring-boot-with-spring-batch-sample.git
git push -u origin main
