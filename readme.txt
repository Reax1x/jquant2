Ŀǰ֧��
    /**
     * ����ָ����Ʊ
     * @param stockid ��Ʊ����
     * @param price ָ���۸�
     * @param count ָ������
     */
1 �����Ʊ 
����http://localhost/stockServlet?action=1&stockid=601016&price=2.33&count=100&psw=123

    /**
     * ����ָ����Ʊ
     * @param stockid ��Ʊ����
     * @param price ָ���۸�
     * @param count ָ������
     */
2 �����Ʊ 
����http://localhost/stockServlet?action=0&stockid=601016&price=2.33&count=100&psw=123

3��ѯ�����ʽ�
����http://localhost/sstockServlet?action=5&psw=123
����
{
	"result": true,  ��ѯ�ɹ���־
	"amount": "124.35",  ���ý��
	"balance": "124.35", �ʽ����
	"freezing": "12.00", ������
	"available": "623.35",  ��ȡ���
	"totalassets": "723.35", �� �� ��
	"worth": "123.00" ��Ʊ��ֵ
}

4 ˢ��
����http://localhost/sstockServlet?action=4&psw=123
5 ȫ������
����http://localhost/sstockServlet?action=3&psw=123


