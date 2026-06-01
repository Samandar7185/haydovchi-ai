from fastapi import FastAPI
app = FastAPI(title='Haydovchi AI Backend')
@app.get('/')
def root(): return {'status': 'Haydovchi AI Backend ishlayapti! 🚛'}
