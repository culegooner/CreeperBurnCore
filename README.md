CreeperBurnCore
===============

https://github.com/culegooner/CreeperBurnCore

To download the binary click here https://github.com/culegooner/CreeperBurnCore/releases

This is a coremod for minecraft forge 1.6.1
it patches the minecraft EntityCreeper class.
Do not install this mod along with CreeperBurnMod.

To use in development:
Add the modified base classes inside CreeperBurnCore_dummy.jar
Copy CreeperBurnCore_dummy.jar to jars/mods

The base classes are inside CreeperBurnCore_dummy.jar
net/minecraft/entity/monster/EntityCreeper.class
tc.class

Look at EntityCreeper.patch to see what was changed

To compile for regular minecraft use
run the command ant
any *.class file on the project root level will be included in the jar automatically

This is part of a tutorial on forge 1.6.1 events and coremods

http://www.minecraftforum.net/topic/1854988-tutorial-152161-changing-vanilla-without-editing-base-classes-coremods-and-events-very-advanced/


