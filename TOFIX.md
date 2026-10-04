# TOFIX

Findings from a code scan on 2026-10-04.

## Medium

- `src/scripts/show_docs.sh:3-5` - uses `gnome-open`, which no longer exists on current Ubuntu (only `xdg-open` is installed), and two of the three paths (`/usr/share/doc/groovy-doc/groovy-jdk/index.html`, `/usr/share/doc/groovy-doc/gapi/index.html`) are not shipped by the current `groovy-doc` package; switch to `xdg-open` and keep only `/usr/share/doc/groovy/api/index.html`. Errors are also hidden by `>/dev/null 2>&1`, which is why this went unnoticed.
- `exercises/03_maps.groovy:6` - `if(m2[x.key])` tests the *value's* truthiness, so a common key whose value is `''`, `0` or `null` is skipped instead of compared; use `m2.containsKey(x.key)`.

## Low

- `exercises/02_functional_programming.groovy:1-13` - the solution only covers the first of the three tasks in `exercises/02_functional_programming.md` (the map and reduce functions are missing); add them.
- `exercises/01_groovy_basics.md:4` - "on other system: ?" is a leftover placeholder; fill in (SDKMAN, brew) or drop it.
- `src/Makefile:3` - `fgrep` is obsolescent (GNU grep 3.8+ warns on every call); use `grep -F`.
- `rsconstruct.toml:28,32,35` - `rumdl`/`zspell` scan `src` (no markdown there) and `shellcheck` scans `exercises` and `config` (no shell scripts there); list only the directories that hold each file type (`exercises` for markdown, `src` for shell).
- `src/classpath/dirUser2/README.txt:1` - typos "the the" and "envrionment".
