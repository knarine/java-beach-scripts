# Class: jenkins::params
#
#
class jenkins::params {
  $version            = 'installed'
  $lts                = false
  $repo               = true
  $service_enable     = true
  $service_ensure     = 'running'
  $install_java       = false
  $swarm_version      = '1.9'
}


