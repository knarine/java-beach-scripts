java-beach-scripts
==================

Pre-requisites:
	1. Install git
		(i) General (git-scm.com/download/<os>); where <os> = [mac, windows, linux]
		(ii) Mac git-scm.com/download/mac
	2. Install Virtual Box:
		(i) General https://www.virtualbox.org/wiki/Downloads
		(ii) Mac http://download.virtualbox.org/virtualbox/4.3.12/VirtualBox-4.3.12-93733-OSX.dmg
	3. Install Vagrant
		(i) General http://www.vagrantup.com/downloads.html
		(ii) Mac https://dl.bintray.com/mitchellh/vagrant/vagrant_1.6.3.dmg)
	4. Text editor or IDE of choice
	
	
Setup the Development Environment:
	1. Import the SCRIPTS workspace - git@github.com:knarine/java-beach-scripts.git
	2. Open a terminal window in this location (navigate to the root of the directory)
	3. Run "vagrant up"
		(i)	The VM will be downloaded if it is not already stored locally
		(ii) The VM will be provisioned with the items as noted in manifests\site.pp:
			(a)	Git
			(b)	NodeJs
			(c) Java
			(d) Jenkins


List of vagrant boxes with Puppet installed:
	1. Current (Ubuntu 12) - 
	2. Ubuntu 13 - http://goo.gl/Y4aRr
	3. Ubuntu 13, 64 bit - http://puppet-vagrant-boxes.puppetlabs.com/ubuntu-1310-x64-virtualbox-puppet.box
	4. http://puppet-vagrant-boxes.puppetlabs.com/
	5. http://www.vagrantbox.es/
