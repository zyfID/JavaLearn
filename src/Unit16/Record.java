package Unit16;

public class Record {
	
	@Field_Method_Parameter_Annotation(describe = "���", type = int.class)
	int id;
	
	@Field_Method_Parameter_Annotation(describe = "����", type = String.class)
	String name;
	
	@Constructor_Annotation()
	public Record() {
		
	}
	
	@Constructor_Annotation("������ʼ�����췽��")
	public Record(
			
			@Field_Method_Parameter_Annotation(describe = "���", type = int.class)
			int id, 
			
			@Field_Method_Parameter_Annotation(describe = "����", type = String.class)
			String name
			) {
		
		this.id = id;
		this.name = name;
		
	}
	
	//������id,name�Լ����id,name�������ע��
	@Field_Method_Parameter_Annotation(describe = "��ñ��", type = int.class)
	public int getId() {
		return this.id;
	}
	
	@Field_Method_Parameter_Annotation(describe = "���ñ��")
	public void setId(
			@Field_Method_Parameter_Annotation(describe = "���", type = int.class)
			int id) {
		this.id = id;
	}
	
	@Field_Method_Parameter_Annotation(describe = "�������", type = String.class)
	public String getName() {
		return this.name;
	}
	
	@Field_Method_Parameter_Annotation(describe = "��������")
	public void setName(
			@Field_Method_Parameter_Annotation(describe = "����", type = String.class)
			String name) {
		this.name = name;
	}

}
