CreeperBurnCore
===============

https://github.com/culegooner/CreeperBurnCore
http://www.minecraftforum.net/topic/1884425-

To download the binary click here https://github.com/culegooner/CreeperBurnCore/releases

This is a coremod for minecraft forge 1.6
it patches the minecraft EntityCreeper class.

You're not supposed to install this with the CreeperBurnMod mod.

To use in development:
Add the modified base classes inside CreeperBurnCore_dummy.jar
Copy CreeperBurnCore_dummy.jar to jars/mods

The base classes are inside CreeperBurnCore_dummy.jar
net/minecraft/entity/monster/EntityCreeper.class
te.class

Look at EntityCreeper.patch to see what was changed

To compile a release build
run the command ant

Any *.class files in the project root level will be included in the jar automatically

This is part of a tutorial on forge 1.6 events and coremods

http://www.minecraftforum.net/topic/1854988-


