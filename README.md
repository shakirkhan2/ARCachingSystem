# Adaptive Replacement Caching system
This cache system is initialized with an integer, which defines the maximum number of keys which your caching system should store. A full cache occurs when number of keys reaches this.
https://en.wikipedia.org/wiki/Adaptive_replacement_cache


### Prerequisites
* jdk (>=1.7 required)
* mysql (>=5.7 required)


### Installing

Clone Repository

```
git@github.com:Shakir-Khan/ARCachingSystem.git
```
Install mysql

Mac
```
brew install mysql
```
Ubuntu
```
sudo apt-get install mysql-server
```

Create databse

```
CREATE DATABASE arcache;
```

Use databse

```
use arcache;

```

Create User

```
CREATE USER 'arcache'@'localhost' IDENTIFIED BY 'arc@123';
```

Give permission to user

```
GRANT ALL PRIVILEGES ON * . * TO 'arcache'@'localhost';
```

```
CREATE TABLE IF NOT EXISTS `cache` (
  `pageId` int(11) DEFAULT NULL,
  `pageValue` int(11) DEFAULT NULL
);
```

## Preview of Test Cases

![Image]()

## Contributing

Please read [CONTRIBUTING.md](https://github.com/Shakir-Khan/ARCachingSystem/blob/master/CONTRIBUTING.md) for details on our code of conduct, and the process for submitting pull requests.


## Authors

* **Shakir Khan** [github](https://github.com/Shakir-Khan)

See also the list of [contributors](https://github.com/Shakir-Khan/ARCachingSystem/graphs/contributors) who participated in this project.
