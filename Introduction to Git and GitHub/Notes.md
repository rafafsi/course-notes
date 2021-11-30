# What I learned (with Otávio Reis)

### SHA-1:

	It means Secure Hash Algorithm that is a cryptographic hash function wish takes an input and produces a hash value with 40 characters. It's a very secure way to represents a file state.

### **Git Objects**:

- **Blob**: is identified by its SHA-1 hash and represents a file, like a "label" of this file.

- **Tree**: is also identified by its SHA-1, but is referring all the files (or blobs) that is inside of it. The trees are responsible to make all the structure that where the file is.
- **Commit**: is a snapshot of a tree. A commit object includes a pointer to the main tree, as well as other meta-data such as the committer, a commit message and the commit time.

### Main Git commands:

- **git init **

- **git config** 
- **git pull**
- **git push**
- **git commit**
- **git status**
- **git clone**
- **git remote add origin**
- **git remote -v**

### Development Environment

- **Working Area**: is the files that are not in the staging area; where are the untracked files.
- **Staging Area**: is the files are going to be a part of your next commit; now the Git knows about this files.
- **Local Repository**: the place where are the files after the commit.