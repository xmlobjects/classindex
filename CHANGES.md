# Changelog

## [Unreleased]
### Changed
- **Breaking:** Java 17 is now the minimum required version for using classindex.
- Merged changes in version 3.13 from original repository.

## [3.12.0] - 2022-06-16
### Changed
- Removed deprecated class `org.atteo.evo.classindex.ClassIndex`

### Fixed
- Prevent interfaces from being written to the services file

## 3.11.1 - 2021-10-26
### Changes
- `classindex` is now a Java module and requires Java 11 or above
- Changed Maven coordinates to `org.xmlobjects:classindex`
- Replaced deprecated scanner class in `ClassIndexProcessor`
- Replaced Maven with Gradle as build tool

## 3.11 and before
Changes for version 3.11 and before are documented in the [original repository](https://github.com/atteo/classindex/blob/master/CHANGES.md).

[Unreleased]: https://github.com/xmlobjects/classindex/compare/v3.12.0..HEAD
[3.12.0]: https://github.com/xmlobjects/classindex/releases/tag/v3.12.0