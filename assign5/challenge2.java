public class challenge2 {
	public static void main(String[] args) {

		double[] NE = {-0.6179074665219488, 0.012080423982449795, -0.21346000509541063, 0.08299652983289585, 2.44401680106775, 4.902778859313734, 1.7132831483350532, -4.2004763396051725, -4.043856195861675, -2.6728507023602326, 5.181911533071974, -2.1235877432845354, 7.603895698367564, -5.6730748575837975, -3.5868701412258464, 8.50824673494424, 1.9530312960520657, 1.4057711751329447, -6.6010520166956885, -0.8889270825881894, -3.066437913144831, -1.047977711607209, -0.6183425325427638, -1.9567474971238643, -1.6108985491087715, -3.4762343504063105, -0.7819967483948718, 1.2787199500848474, -1.724036624119682, 4.134045084705252, -4.302090407212001, 4.522452909896921, -9.510982189042458, 4.483571903648103, 4.734972592935479, 1.3007048393668028, -1.5733757395516363, -1.9343054344201707, 6.787212280236046, -0.35603892339489995, -1.3414921239899753, -0.9393551256779856, -1.9298884254368263, 6.043295105337908, 2.9330671137121733, 2.8561036619044047, -0.8293767467550212, 6.123622142714353, -2.2350961485598777, 7.20722805161423, 5.515389689089437, -2.7666432567169745, -4.344590134196103, 3.3453531590362613, 10.413288779778698, 0.3986583788822756, 1.8156402784897105, -6.495232639280744, -2.5586148068696852, 2.456750085945401, -2.0241915465317994, 2.6640207424833706, -3.221638093253812, -0.13291701098446618, 4.525894152095317, 3.833943185257407, -2.892260297173234, -3.247865929061468, 6.129696012756685, 4.451839001858698, -3.142375819178058, -1.0758596832313212, -7.85705595464708, -3.376343621066232, -3.993944532318441, 13.146850947670861, -1.3900676627648902, 3.8600378751921256, 3.9652071948870447, -2.4382860496298324, 3.0864605092488304, -10.769089293963074, 1.9773754511588617, 4.826841112732377, 7.9219782116860324, -3.266132871461332, 1.8118819669439024, 0.698579723806034, 7.119629551067371, -0.9141128559070014, 1.5143207368301361, -8.587596597534729, -0.9387144566983379, 2.5641381148921805, 10.628593146418485, 3.794317923770138, 6.2802756227726615, -0.05171930511667566, 0.8736426098894451, 0.6226851580000003};
		double[] NW = {9.631212195521316, -2.1235831279282698, 3.7468670477204773, -4.559878135521824, 3.2444286767576545, 6.2877828741148605, 6.520597627024687, 2.642307472836288, 1.2002893113069557, 0.32620641006622675, -3.368962812990781, -2.588868228199504, 4.356518441561512, -0.5955112302723241, 0.3875648501871751, -2.9311051175998064, 2.0095554763173666, -1.228769483871199, 5.900445902470515, 0.41527619439744434, 2.9752128071432145, 4.805920315662717, -4.797853823364673, 5.752192282393844, 2.9073605365834556, 2.4870719041084497, -1.7994046436584152, 7.79554996548367, 4.4174973514255536, 2.084039895979635, 0.6281302992116424, -3.1466915662704524, 3.646400672147826, 0.9609952887592054, -6.070082172976056, -0.9392599054917704, 0.904301836858967, 5.926867039519574, 3.238559698585232, -4.439332575192746, 1.352444182896236, -0.24594080100384297, -1.6395807550351367, 3.591208179788307, 4.15757174804611, -3.5334824535956173, 0.5302366137985215, 9.564674975899017, 4.175389023096817, -0.9827335882191762, 4.305890552392608, 3.059083687714633, 2.3224548745551488, 0.1934380213592375, 1.0235814, 1.1716370685853148, -2.931711339626567, -4.214035402157694, -1.0093422753964358, -4.843082160061708, -7.148710177896536, -1.910725804980465, -0.22905523068711164, 3.8200222938181367, -1.744095856344644, 1.354958988184811, 0.9933832752568843, 0.8820951391051288, -2.062035935350486, -7.633897329029599, 0.49911238393151325, -1.1684033502541722, 4.090099097765502, 4.566828839384462, 0.6901115935421007, -4.30695891725898, -5.637531096381548, 2.6920329212478507, -1.522395621132775, 6.351734133984433, 0.4895678835360122, -4.755548841958967, -2.826990702897114, 1.974618789378563, -6.999938959339396, 0.6289774718852977, 3.2732671487606266, -1.2781272997669557, 6.725303989648547, -7.163688015215646, 5.547683884070125, -3.0189942298996213, -0.2487963910538069, -0.46314538549764894, 5.3913279138183645, -4.018219623545416, 6.491084381355617, -1.5629014732514819, -6.557894883162792, -3.856421007612216};
		
		double latitude1 = 0;
		double longitude1 = 0;
		double latitude2 = 0;
		double longitude2 = 0;

		for (int i = 0; i < NE.length; i++) {
			if (i % 2 == 0) {
				latitude1 += NE[i];
			}
			if (i % 2 != 0) {
				longitude1 += NE[i];
			}
		}
		System.out.println(latitude1 + "N");
		System.out.println(longitude1 + "E");

		for (int j = 0; j < NW.length; j++) {
			if (j % 2 == 0) {
				latitude2 += NW[j];
			}
			if (j % 2 != 0) {
				longitude2 += NW[j];
			}
		}
		System.out.println(latitude2 + "N");
		System.out.println(longitude2 + "W");
	}
	// moonstone
}