package classesBasicas;

public class Endereco {
	
		private String logradouro;
		private String cidade;
		private String bairro;
		private String estado;
		private String numero;
		private String cep;
		
		public Endereco(String logradouro, String cidade, String bairro, String estado, String numero, String cep) {
			this.logradouro = logradouro;
			this.cidade = cidade;
			this.bairro = bairro;
			this.estado = estado;
			this.numero = numero;
			this.cep = cep;
		}

		public String getLogradouro() {
			return logradouro;
		}

		public void setLogradouro(String logradouro) {
			this.logradouro = logradouro;
		}

		public String getCidade() {
			return cidade;
		}

		public void setCidade(String cidade) {
			this.cidade = cidade;
		}

		public String getBairro() {
			return bairro;
		}

		public void setBairro(String bairro) {
			this.bairro = bairro;
		}

		public String getEstado() {
			return estado;
		}

		public void setEstado(String estado) {
			this.estado = estado;
		}

		public String getNumero() {
			return numero;
		}

		public void setNumero(String numero) {
			this.numero = numero;
		}

		public String getCep() {
			return cep;
		}

		public void setCep(String cep) {
			this.cep = cep;
		}
}
