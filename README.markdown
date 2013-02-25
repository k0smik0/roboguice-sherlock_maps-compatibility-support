# roboguice-sherlock Library with maps-compatibility support

This is a fork of roboguice-sherlock.

It allows you can use FragmentMap in your roboguiced-sherlocked code.

## Details:

You know how actionbarsherlock provides actionbar compatibility for android < 4.x  
and you know how roboguice improves your developing providing a beautiful IoC implementation  
    
so, you would merge together: et voilà roboguice-sherlock  
(and a new project/package is mandatory because java doesn't permits class multiple inheritance - see [here][1]) 

but no ones of these three allows to use fragmentmap or a kind of fragmentmapactivity   
(remembering that official [fragment support library][2] does not provide map support)

### this solution:
this library forks original roboguice-sherlock, and provides support for fragment compatibility as for maps
  
it is possible using a fragment support library fork too, which provides map support: [this][3]

and the full [package hierarchy][3]
  
please be careful in compile time:  
all these forks use the new support library with map support - it means you have include this as your library!  
because this, also roboguice has been recompiled using this library  
and actionbarsherlock_mapscompatibility too! 
and, obviously, roboguice-sherlock_maps-compatibility-support (this one you're reading about)  

however, you can find all these libraries in "libs" dir.


enjoy it!


[1]: https://github.com/rtyley/roboguice-sherlock#roboguice-sherlock
[2]: http://developer.android.com/tools/extras/support-library.html
[3]: https://github.com/9re/android-support-v4-googlemaps#android-compatibility-lib--google-maps-hack
[4]: https://docs.google.com/file/d/0B5QXIJ95NIibNWVnM0YyUHJwb0E/edit?usp=sharing