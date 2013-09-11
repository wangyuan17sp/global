/**
 * Implements distance interface for weighted normalized 
 * gapped JTT distance.
 *
 * WARNING WARNING WARNING - CALLERS MUST DO CACHE/GET PROPERLY
 *
 */



public class GappedJTTDistance extends GappedDistance {

    protected void initializeSimpleDistance () {
	simpleDistance = new SimpleJTTDistance();
    }

    // um ok
    public static void test1 () {
	String x = "ACTG---TACGCTAGA--AGACGAT--ACAGATC--A--AC";
	String y = "AAAAAGCTAATCTAGA--AGAGGAT--AGAGTTC-----AC";
	Sequence xs = new Sequence(); xs.sequence = x; xs.name="blah1";
	Sequence ys = new Sequence(); ys.sequence = y; ys.name="blah2";
	GappedJTTDistance d = new GappedJTTDistance ();
	Sequence[] seqs = new Sequence[2];
	seqs[0] = xs;
	seqs[1] = ys;
	double[][] result = d.getDistanceMatrix(seqs);
	System.out.println ("distance is: |" + result[0][1] + "|");
    }

    public static void main (String[] args) {
	test1();
    }

}

