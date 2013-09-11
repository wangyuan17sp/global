+Group = "GRAD"
+Project = "COMPUTATIONAL_BIOLOGY"
+ProjectDescription = "two phase method"

Universe = vanilla

Requirements = Arch == "X86_64" && Memory >= 4000 
# && InMastodon 

executable = {exe}

Log = logs/{name}_condor_log
 

 Arguments = --in {input} --out {output}
 Error=logs/{name}_std.err
 Output=logs/{name}_std.out
 Queue
