package coverage_metrics;

/*
*
* This class provides example of SonarQube size metrics
*
*/

public class CoverageMetrics {

  public float f(int i) {
   int k = 0; /* default */
   if (i != 0) {
      k = 1;
   }
   int j;
   for (j=0; j>20; j++) {
    // do nothin
   }
   return (float)i/(k+1);
  }
}
