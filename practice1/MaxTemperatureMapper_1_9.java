package MaxTemp;
import java.io.IOException;
import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.LongWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Mapper;
public class MaxTemperatureMapper
 extends Mapper<LongWritable, Text, Text, IntWritable> {

 @Override
 public void map(LongWritable key, Text value, Context context)
 throws IOException, InterruptedException {

 String line = value.toString();
 String year = line.substring(0, 4);
 int airTemperature;
 if (line.charAt(6) == '+') { // parseInt doesn't like leading plus signs
 airTemperature = Integer.parseInt(line.substring(7, 9));
 } else {
 airTemperature = Integer.parseInt(line.substring(6, 9));
 }
  context.write(new Text(year), new IntWritable(airTemperature));
 }
}
