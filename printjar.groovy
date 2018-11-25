// Print an text entry element inside a jar file. Default o the manifest file.
// @author: Zemian Deng 20120709
file = new File(args[0])
name = args.length > 1 ? args[1] : "META-INF/MANIFEST.MF"
jarfile = new java.util.jar.JarFile(file)
entry = jarfile.getEntry(name)
istream = jarfile.getInputStream(entry)
istream.eachLine{ println(it) }
istream.close()
