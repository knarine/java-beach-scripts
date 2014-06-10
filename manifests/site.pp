# Class: git
#
# This class installs git
#
# Actions:
#   - Install the git package
#
# Sample Usage:
#  class { 'git': }
#
class git {
  package { 'git':
    ensure => installed,
  }
}
  
class setupVagrant{
	include git
	include nodejs
	include jenkins
}

include setupVagrant