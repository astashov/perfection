# Perfection

Just a skeleton of a nice dev environment for ClojureScript. Check [this article](http://astashov.github.io/blog/2014/07/30/perfect-clojurescript-development-environment-with-vim/) for details.

## Usage

Fork it, and start building your own awesome ClojureScript projects, using live reloading, live code execution in the running project in a browser from Vim (or other IDE), automatically running tests when you change files, and automatic compile of the release version.

Then, run:

```bash
$ lein figwheel dev
$ lein cljsbuild auto test
$ lein cljsbuild auto release
$ lein repl
```

Then run in Vim `:Piggieback 9000` (make sure you have [vim-fireplace](https://github.com/tpope/vim-fireplace) installed), and open `htto://localhost:3449/index.html` in the browser. You are good to go!
